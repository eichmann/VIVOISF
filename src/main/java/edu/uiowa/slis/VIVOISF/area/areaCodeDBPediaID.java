package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeDBPediaIDIterator thearea = (areaCodeDBPediaIDIterator)findAncestorWithClass(this, areaCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thearea.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

