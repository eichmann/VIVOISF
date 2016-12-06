package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeAGROVOCIterator theterritory = (territoryCodeAGROVOCIterator)findAncestorWithClass(this, territoryCodeAGROVOCIterator.class);
			pageContext.getOut().print(theterritory.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

