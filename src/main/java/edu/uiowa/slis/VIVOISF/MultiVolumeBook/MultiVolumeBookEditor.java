package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookEditorIterator theMultiVolumeBookEditorIterator = (MultiVolumeBookEditorIterator)findAncestorWithClass(this, MultiVolumeBookEditorIterator.class);
			pageContext.getOut().print(theMultiVolumeBookEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for editor tag ");
		}
		return SKIP_BODY;
	}
}

