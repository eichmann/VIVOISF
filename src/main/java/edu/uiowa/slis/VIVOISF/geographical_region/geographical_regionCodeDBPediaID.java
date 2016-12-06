package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeDBPediaIDIterator thegeographical_region = (geographical_regionCodeDBPediaIDIterator)findAncestorWithClass(this, geographical_regionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

