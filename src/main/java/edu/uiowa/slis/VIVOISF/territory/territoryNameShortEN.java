package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameShortENIterator theterritory = (territoryNameShortENIterator)findAncestorWithClass(this, territoryNameShortENIterator.class);
			pageContext.getOut().print(theterritory.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

