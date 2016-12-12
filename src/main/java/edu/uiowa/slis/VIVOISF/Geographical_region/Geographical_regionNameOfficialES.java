package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameOfficialESIterator theGeographical_region = (Geographical_regionNameOfficialESIterator)findAncestorWithClass(this, Geographical_regionNameOfficialESIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

