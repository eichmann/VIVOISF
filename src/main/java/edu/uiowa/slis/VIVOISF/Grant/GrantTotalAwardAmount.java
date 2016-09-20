package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantTotalAwardAmount extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantTotalAwardAmount currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantTotalAwardAmount.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			if (!theGrant.commitNeeded) {
				pageContext.getOut().print(theGrant.getTotalAwardAmount());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for totalAwardAmount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for totalAwardAmount tag ");
		}
		return SKIP_BODY;
	}

	public String getTotalAwardAmount() throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			return theGrant.getTotalAwardAmount();
		} catch (Exception e) {
			log.error(" Can't find enclosing Grant for totalAwardAmount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for totalAwardAmount tag ");
		}
	}

	public void setTotalAwardAmount(String totalAwardAmount) throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			theGrant.setTotalAwardAmount(totalAwardAmount);
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for totalAwardAmount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for totalAwardAmount tag ");
		}
	}
}

