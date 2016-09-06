package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameListENIterator thegeographical_region = (geographical_regionNameListENIterator)findAncestorWithClass(this, geographical_regionNameListENIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

