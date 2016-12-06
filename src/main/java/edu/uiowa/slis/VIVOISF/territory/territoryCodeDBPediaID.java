package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeDBPediaIDIterator theterritory = (territoryCodeDBPediaIDIterator)findAncestorWithClass(this, territoryCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theterritory.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

