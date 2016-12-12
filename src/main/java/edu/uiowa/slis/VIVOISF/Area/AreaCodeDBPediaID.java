package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeDBPediaIDIterator theArea = (AreaCodeDBPediaIDIterator)findAncestorWithClass(this, AreaCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theArea.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

