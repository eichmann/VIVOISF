package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantGrantDirectCosts extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantGrantDirectCosts currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantGrantDirectCosts.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			if (!theGrant.commitNeeded) {
				pageContext.getOut().print(theGrant.getGrantDirectCosts());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for grantDirectCosts tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for grantDirectCosts tag ");
		}
		return SKIP_BODY;
	}

	public String getGrantDirectCosts() throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			return theGrant.getGrantDirectCosts();
		} catch (Exception e) {
			log.error(" Can't find enclosing Grant for grantDirectCosts tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for grantDirectCosts tag ");
		}
	}

	public void setGrantDirectCosts(String grantDirectCosts) throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			theGrant.setGrantDirectCosts(grantDirectCosts);
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for grantDirectCosts tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for grantDirectCosts tag ");
		}
	}
}

