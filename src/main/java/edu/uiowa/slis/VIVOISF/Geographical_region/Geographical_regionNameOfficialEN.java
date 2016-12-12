package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameOfficialENIterator theGeographical_region = (Geographical_regionNameOfficialENIterator)findAncestorWithClass(this, Geographical_regionNameOfficialENIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

