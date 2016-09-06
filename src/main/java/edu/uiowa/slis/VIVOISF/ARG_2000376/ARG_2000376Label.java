package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376Label currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376 theARG_2000376 = (ARG_2000376)findAncestorWithClass(this, ARG_2000376.class);
			if (!theARG_2000376.commitNeeded) {
				pageContext.getOut().print(theARG_2000376.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ARG_2000376 theARG_2000376 = (ARG_2000376)findAncestorWithClass(this, ARG_2000376.class);
			return theARG_2000376.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ARG_2000376 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ARG_2000376 theARG_2000376 = (ARG_2000376)findAncestorWithClass(this, ARG_2000376.class);
			theARG_2000376.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for label tag ");
		}
	}
}

