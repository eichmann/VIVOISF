package edu.uiowa.slis.VIVOISF.IAO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000007Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000007Label currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000007Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000007 theIAO_0000007 = (IAO_0000007)findAncestorWithClass(this, IAO_0000007.class);
			if (!theIAO_0000007.commitNeeded) {
				pageContext.getOut().print(theIAO_0000007.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000007 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000007 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			IAO_0000007 theIAO_0000007 = (IAO_0000007)findAncestorWithClass(this, IAO_0000007.class);
			return theIAO_0000007.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000007 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000007 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			IAO_0000007 theIAO_0000007 = (IAO_0000007)findAncestorWithClass(this, IAO_0000007.class);
			theIAO_0000007.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000007 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000007 for label tag ");
		}
	}
}

