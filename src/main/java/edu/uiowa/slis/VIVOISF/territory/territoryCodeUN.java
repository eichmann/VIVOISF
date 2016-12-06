package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeUNIterator theterritory = (territoryCodeUNIterator)findAncestorWithClass(this, territoryCodeUNIterator.class);
			pageContext.getOut().print(theterritory.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

