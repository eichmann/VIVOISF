package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseTranscriptOfIterator theDatabaseTranscriptOfIterator = (DatabaseTranscriptOfIterator)findAncestorWithClass(this, DatabaseTranscriptOfIterator.class);
			pageContext.getOut().print(theDatabaseTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

