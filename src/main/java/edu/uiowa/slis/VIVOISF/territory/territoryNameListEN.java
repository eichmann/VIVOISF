package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameListENIterator theterritory = (territoryNameListENIterator)findAncestorWithClass(this, territoryNameListENIterator.class);
			pageContext.getOut().print(theterritory.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

