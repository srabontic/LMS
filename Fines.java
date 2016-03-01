/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsys;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "fines")
@NamedQueries({
    @NamedQuery(name = "Fines.findAll", query = "SELECT f FROM Fines f"),
    @NamedQuery(name = "Fines.findByLoanId", query = "SELECT f FROM Fines f WHERE f.loanId = :loanId"),
    @NamedQuery(name = "Fines.findByFineAmt", query = "SELECT f FROM Fines f WHERE f.fineAmt = :fineAmt"),
    @NamedQuery(name = "Fines.findByPaid", query = "SELECT f FROM Fines f WHERE f.paid = :paid")})
public class Fines implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "loan_id")
    private Integer loanId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "fine_amt")
    private BigDecimal fineAmt;
    @Basic(optional = false)
    @Column(name = "paid")
    private boolean paid;
    @JoinColumn(name = "loan_id", referencedColumnName = "loan_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private BookLoans bookLoans;

    public Fines() {
    }

    public Fines(Integer loanId) {
        this.loanId = loanId;
    }

    public Fines(Integer loanId, BigDecimal fineAmt, boolean paid) {
        this.loanId = loanId;
        this.fineAmt = fineAmt;
        this.paid = paid;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public BigDecimal getFineAmt() {
        return fineAmt;
    }

    public void setFineAmt(BigDecimal fineAmt) {
        this.fineAmt = fineAmt;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public BookLoans getBookLoans() {
        return bookLoans;
    }

    public void setBookLoans(BookLoans bookLoans) {
        this.bookLoans = bookLoans;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loanId != null ? loanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fines)) {
            return false;
        }
        Fines other = (Fines) object;
        if ((this.loanId == null && other.loanId != null) || (this.loanId != null && !this.loanId.equals(other.loanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librarymanagementsys.Fines[ loanId=" + loanId + " ]";
    }
    
}
