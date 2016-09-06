package edu.uiowa.slis.VIVOISF.ARG_2000021;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000021Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000021Label currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000021Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000021 theARG_2000021 = (ARG_2000021)findAncestorWithClass(this, ARG_2000021.class);
			if (!theARG_2000021.commitNeeded) {
				pageContext.getOut().print(theARG_2000021.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000021 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000021 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ARG_2000021 theARG_2000021 = (ARG_2000021)findAncestorWithClass(this, ARG_2000021.class);
			return theARG_2000021.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ARG_2000021 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000021 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ARG_2000021 theARG_2000021 = (ARG_2000021)findAncestorWithClass(this, ARG_2000021.class);
			theARG_2000021.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000021 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000021 for label tag ");
		}
	}
}

