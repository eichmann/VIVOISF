package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantSponsorAwardId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantSponsorAwardId currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantSponsorAwardId.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			if (!theGrant.commitNeeded) {
				pageContext.getOut().print(theGrant.getSponsorAwardId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for sponsorAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for sponsorAwardId tag ");
		}
		return SKIP_BODY;
	}

	public String getSponsorAwardId() throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			return theGrant.getSponsorAwardId();
		} catch (Exception e) {
			log.error(" Can't find enclosing Grant for sponsorAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for sponsorAwardId tag ");
		}
	}

	public void setSponsorAwardId(String sponsorAwardId) throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			theGrant.setSponsorAwardId(sponsorAwardId);
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for sponsorAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for sponsorAwardId tag ");
		}
	}
}

