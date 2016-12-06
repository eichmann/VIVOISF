package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeUNDPIterator thegeographical_region = (geographical_regionCodeUNDPIterator)findAncestorWithClass(this, geographical_regionCodeUNDPIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

