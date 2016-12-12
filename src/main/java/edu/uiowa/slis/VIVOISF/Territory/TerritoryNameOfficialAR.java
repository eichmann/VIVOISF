package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameOfficialARIterator theTerritory = (TerritoryNameOfficialARIterator)findAncestorWithClass(this, TerritoryNameOfficialARIterator.class);
			pageContext.getOut().print(theTerritory.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

