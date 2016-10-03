package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetEditorIterator theDatasetEditorIterator = (DatasetEditorIterator)findAncestorWithClass(this, DatasetEditorIterator.class);
			pageContext.getOut().print(theDatasetEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for editor tag ");
		}
		return SKIP_BODY;
	}
}

