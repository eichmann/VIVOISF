package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeGAULIterator theTerritory = (TerritoryCodeGAULIterator)findAncestorWithClass(this, TerritoryCodeGAULIterator.class);
			pageContext.getOut().print(theTerritory.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

