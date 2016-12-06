package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeDBPediaIDIterator theContinent = (ContinentCodeDBPediaIDIterator)findAncestorWithClass(this, ContinentCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theContinent.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

