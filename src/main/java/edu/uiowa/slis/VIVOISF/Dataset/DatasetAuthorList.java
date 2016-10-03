package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetAuthorListIterator theDatasetAuthorListIterator = (DatasetAuthorListIterator)findAncestorWithClass(this, DatasetAuthorListIterator.class);
			pageContext.getOut().print(theDatasetAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for authorList tag ");
		}
		return SKIP_BODY;
	}
}

