package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameOfficialENIterator theterritory = (territoryNameOfficialENIterator)findAncestorWithClass(this, territoryNameOfficialENIterator.class);
			pageContext.getOut().print(theterritory.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

