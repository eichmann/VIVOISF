package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeGAULIterator theArea = (AreaCodeGAULIterator)findAncestorWithClass(this, AreaCodeGAULIterator.class);
			pageContext.getOut().print(theArea.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

