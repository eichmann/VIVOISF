package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameOfficialRUIterator theGeographical_region = (Geographical_regionNameOfficialRUIterator)findAncestorWithClass(this, Geographical_regionNameOfficialRUIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

