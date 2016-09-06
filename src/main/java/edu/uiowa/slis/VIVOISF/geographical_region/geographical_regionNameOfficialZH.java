package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameOfficialZHIterator thegeographical_region = (geographical_regionNameOfficialZHIterator)findAncestorWithClass(this, geographical_regionNameOfficialZHIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

