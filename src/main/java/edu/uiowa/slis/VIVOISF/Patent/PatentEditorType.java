package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentEditorIterator thePatentEditorIterator = (PatentEditorIterator)findAncestorWithClass(this, PatentEditorIterator.class);
			pageContext.getOut().print(thePatentEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for editor tag ");
		}
		return SKIP_BODY;
	}
}

