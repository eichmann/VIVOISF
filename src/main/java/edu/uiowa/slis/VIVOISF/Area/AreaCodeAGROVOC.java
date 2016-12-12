package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeAGROVOCIterator theArea = (AreaCodeAGROVOCIterator)findAncestorWithClass(this, AreaCodeAGROVOCIterator.class);
			pageContext.getOut().print(theArea.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

