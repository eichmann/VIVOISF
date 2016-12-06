package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			if (!theCollection.commitNeeded) {
				pageContext.getOut().print(theCollection.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			return theCollection.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Collection for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			theCollection.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for abbreviation tag ");
		}
	}
}

