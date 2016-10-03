package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseProducerIterator theDatabaseProducerIterator = (DatabaseProducerIterator)findAncestorWithClass(this, DatabaseProducerIterator.class);
			pageContext.getOut().print(theDatabaseProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for producer tag ");
		}
		return SKIP_BODY;
	}
}

