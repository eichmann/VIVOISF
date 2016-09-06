package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			if (!theGrant.commitNeeded) {
				pageContext.getOut().print(theGrant.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			return theGrant.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Grant for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Grant theGrant = (Grant)findAncestorWithClass(this, Grant.class);
			theGrant.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for label tag ");
		}
	}
}

