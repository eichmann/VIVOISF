package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameOfficialITIterator theTerritory = (TerritoryNameOfficialITIterator)findAncestorWithClass(this, TerritoryNameOfficialITIterator.class);
			pageContext.getOut().print(theTerritory.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

