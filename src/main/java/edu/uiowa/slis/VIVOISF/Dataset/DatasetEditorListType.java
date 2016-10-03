package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetEditorListIterator theDatasetEditorListIterator = (DatasetEditorListIterator)findAncestorWithClass(this, DatasetEditorListIterator.class);
			pageContext.getOut().print(theDatasetEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for editorList tag ");
		}
		return SKIP_BODY;
	}
}

