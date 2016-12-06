package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379CodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379CodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379CodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379CodeGAULIterator theARG_2000379 = (ARG_2000379CodeGAULIterator)findAncestorWithClass(this, ARG_2000379CodeGAULIterator.class);
			pageContext.getOut().print(theARG_2000379.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

