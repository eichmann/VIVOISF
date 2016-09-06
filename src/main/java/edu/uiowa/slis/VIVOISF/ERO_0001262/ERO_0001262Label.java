package edu.uiowa.slis.VIVOISF.ERO_0001262;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001262Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001262Label currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001262Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001262 theERO_0001262 = (ERO_0001262)findAncestorWithClass(this, ERO_0001262.class);
			if (!theERO_0001262.commitNeeded) {
				pageContext.getOut().print(theERO_0001262.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001262 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ERO_0001262 theERO_0001262 = (ERO_0001262)findAncestorWithClass(this, ERO_0001262.class);
			return theERO_0001262.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0001262 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ERO_0001262 theERO_0001262 = (ERO_0001262)findAncestorWithClass(this, ERO_0001262.class);
			theERO_0001262.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001262 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for label tag ");
		}
	}
}

