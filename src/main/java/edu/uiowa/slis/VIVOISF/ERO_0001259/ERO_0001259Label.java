package edu.uiowa.slis.VIVOISF.ERO_0001259;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001259Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001259Label currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001259Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001259 theERO_0001259 = (ERO_0001259)findAncestorWithClass(this, ERO_0001259.class);
			if (!theERO_0001259.commitNeeded) {
				pageContext.getOut().print(theERO_0001259.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001259 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001259 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ERO_0001259 theERO_0001259 = (ERO_0001259)findAncestorWithClass(this, ERO_0001259.class);
			return theERO_0001259.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0001259 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001259 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ERO_0001259 theERO_0001259 = (ERO_0001259)findAncestorWithClass(this, ERO_0001259.class);
			theERO_0001259.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001259 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001259 for label tag ");
		}
	}
}

