package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasOfficialNameIterator thegeographical_region = (geographical_regionHasOfficialNameIterator)findAncestorWithClass(this, geographical_regionHasOfficialNameIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

