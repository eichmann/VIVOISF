package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumEditorInverseIterator theConsortiumEditorInverseIterator = (ConsortiumEditorInverseIterator)findAncestorWithClass(this, ConsortiumEditorInverseIterator.class);
			pageContext.getOut().print(theConsortiumEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for editor tag ");
		}
		return SKIP_BODY;
	}
}

