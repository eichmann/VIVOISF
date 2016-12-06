package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameCurrencyRUIterator theEditorship = (EditorshipNameCurrencyRUIterator)findAncestorWithClass(this, EditorshipNameCurrencyRUIterator.class);
			pageContext.getOut().print(theEditorship.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

