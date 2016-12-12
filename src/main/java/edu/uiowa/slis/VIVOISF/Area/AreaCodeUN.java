package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeUNIterator theArea = (AreaCodeUNIterator)findAncestorWithClass(this, AreaCodeUNIterator.class);
			pageContext.getOut().print(theArea.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

