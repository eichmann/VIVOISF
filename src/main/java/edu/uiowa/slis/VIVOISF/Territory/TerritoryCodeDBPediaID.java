package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeDBPediaIDIterator theTerritory = (TerritoryCodeDBPediaIDIterator)findAncestorWithClass(this, TerritoryCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theTerritory.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

