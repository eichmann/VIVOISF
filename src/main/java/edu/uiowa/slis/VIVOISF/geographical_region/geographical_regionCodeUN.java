package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeUNIterator thegeographical_region = (geographical_regionCodeUNIterator)findAncestorWithClass(this, geographical_regionCodeUNIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

