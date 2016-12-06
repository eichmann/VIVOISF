package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeUNIterator thearea = (areaCodeUNIterator)findAncestorWithClass(this, areaCodeUNIterator.class);
			pageContext.getOut().print(thearea.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

