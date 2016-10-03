package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseEditorIterator theDatabaseEditorIterator = (DatabaseEditorIterator)findAncestorWithClass(this, DatabaseEditorIterator.class);
			pageContext.getOut().print(theDatabaseEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for editor tag ");
		}
		return SKIP_BODY;
	}
}

