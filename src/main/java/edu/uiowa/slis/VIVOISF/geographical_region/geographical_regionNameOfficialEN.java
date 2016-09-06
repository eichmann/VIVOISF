package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameOfficialENIterator thegeographical_region = (geographical_regionNameOfficialENIterator)findAncestorWithClass(this, geographical_regionNameOfficialENIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

