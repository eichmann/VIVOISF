package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqEditorListInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqEditorListInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqEditorListInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqEditorListInverseIterator theSeqEditorListInverseIterator = (SeqEditorListInverseIterator)findAncestorWithClass(this, SeqEditorListInverseIterator.class);
			pageContext.getOut().print(theSeqEditorListInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for editorList tag ");
		}
		return SKIP_BODY;
	}
}

