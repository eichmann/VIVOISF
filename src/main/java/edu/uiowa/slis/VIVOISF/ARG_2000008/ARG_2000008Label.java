package edu.uiowa.slis.VIVOISF.ARG_2000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000008Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000008Label currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000008Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000008 theARG_2000008 = (ARG_2000008)findAncestorWithClass(this, ARG_2000008.class);
			if (!theARG_2000008.commitNeeded) {
				pageContext.getOut().print(theARG_2000008.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000008 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000008 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ARG_2000008 theARG_2000008 = (ARG_2000008)findAncestorWithClass(this, ARG_2000008.class);
			return theARG_2000008.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ARG_2000008 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000008 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ARG_2000008 theARG_2000008 = (ARG_2000008)findAncestorWithClass(this, ARG_2000008.class);
			theARG_2000008.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000008 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000008 for label tag ");
		}
	}
}

