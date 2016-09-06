package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameOfficialRUIterator thegeographical_region = (geographical_regionNameOfficialRUIterator)findAncestorWithClass(this, geographical_regionNameOfficialRUIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

