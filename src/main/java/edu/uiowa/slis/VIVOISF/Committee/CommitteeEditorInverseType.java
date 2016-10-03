package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeEditorInverseIterator theCommitteeEditorInverseIterator = (CommitteeEditorInverseIterator)findAncestorWithClass(this, CommitteeEditorInverseIterator.class);
			pageContext.getOut().print(theCommitteeEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for editor tag ");
		}
		return SKIP_BODY;
	}
}

