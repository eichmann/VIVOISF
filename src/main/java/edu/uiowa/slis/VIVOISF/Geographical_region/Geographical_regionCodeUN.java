package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionCodeUNIterator theGeographical_region = (Geographical_regionCodeUNIterator)findAncestorWithClass(this, Geographical_regionCodeUNIterator.class);
			pageContext.getOut().print(theGeographical_region.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

