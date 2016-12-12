package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameShortENIterator theGeographical_region = (Geographical_regionNameShortENIterator)findAncestorWithClass(this, Geographical_regionNameShortENIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

